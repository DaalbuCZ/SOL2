package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.q7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class q7<MessageType extends q7<MessageType, BuilderType>, BuilderType extends p7<MessageType, BuilderType>> implements oa {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(Iterable iterable, List list) {
        p9.e(iterable);
        if (iterable instanceof v9) {
            List f10 = ((v9) iterable).f();
            v9 v9Var = (v9) list;
            int size = list.size();
            for (Object obj : f10) {
                if (obj == null) {
                    int size2 = v9Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = v9Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        v9Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof h8) {
                    v9Var.p((h8) obj);
                } else {
                    v9Var.add((String) obj);
                }
            }
        } else if (iterable instanceof va) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(za zaVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final h8 c() {
        try {
            int d10 = d();
            h8 h8Var = h8.f3880o;
            byte[] bArr = new byte[d10];
            p8 c10 = p8.c(bArr);
            e(c10);
            c10.d();
            return new e8(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] i() {
        try {
            byte[] bArr = new byte[d()];
            p8 c10 = p8.c(bArr);
            e(c10);
            c10.d();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
