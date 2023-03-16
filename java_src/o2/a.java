package o2;

import a5.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.e;
import k2.h;
/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f11914c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f11915a = d.f200c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f11916b = d.f199b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.f11915a.decode(byteBuffer).toString();
            charsetDecoder = this.f11915a;
        } catch (CharacterCodingException unused) {
            this.f11915a.reset();
            byteBuffer.rewind();
            try {
                str = this.f11916b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.f11916b.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f11916b;
        } catch (Throwable th2) {
            this.f11915a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }

    @Override // k2.h
    protected k2.a b(e eVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new k2.a(new c(bArr, null, null));
        }
        Matcher matcher = f11914c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = a5.b.e(group);
                e10.hashCode();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new k2.a(new c(bArr, str, str2));
    }
}
