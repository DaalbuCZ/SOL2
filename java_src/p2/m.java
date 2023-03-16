package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p3.m0;
import s1.z1;
/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12238o;

    /* renamed from: p  reason: collision with root package name */
    public final String f12239p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    m(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f12238o = parcel.readString();
        this.f12239p = (String) m0.j(parcel.readString());
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f12238o = str2;
        this.f12239p = str3;
    }

    private static List<Integer> a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() < 7) {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return m0.c(this.f12227n, mVar.f12227n) && m0.c(this.f12238o, mVar.f12238o) && m0.c(this.f12239p, mVar.f12239p);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p2.i, k2.a.b
    public void h(z1.b bVar) {
        String str = this.f12227n;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.L(this.f12239p);
                    return;
                case 1:
                case 11:
                    bVar.Q(this.f12239p);
                    return;
                case 2:
                case '\f':
                    bVar.b0(Integer.valueOf(Integer.parseInt(this.f12239p.substring(2, 4)))).a0(Integer.valueOf(Integer.parseInt(this.f12239p.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.M(this.f12239p);
                    return;
                case 4:
                case 18:
                    bVar.K(this.f12239p);
                    return;
                case 5:
                case 19:
                    bVar.R(this.f12239p);
                    return;
                case 6:
                case 20:
                    String[] P0 = m0.P0(this.f12239p, "/");
                    bVar.l0(Integer.valueOf(Integer.parseInt(P0[0]))).k0(P0.length > 1 ? Integer.valueOf(Integer.parseInt(P0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.i0(this.f12239p);
                    return;
                case '\b':
                case 15:
                    bVar.n0(this.f12239p);
                    return;
                case '\t':
                case 21:
                    bVar.c0(Integer.valueOf(Integer.parseInt(this.f12239p)));
                    return;
                case '\r':
                    List<Integer> a10 = a(this.f12239p);
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            bVar.a0(a10.get(2));
                        }
                        bVar.b0(a10.get(1));
                    }
                    bVar.c0(a10.get(0));
                    return;
                case 14:
                    List<Integer> a11 = a(this.f12239p);
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            bVar.d0(a11.get(2));
                        }
                        bVar.e0(a11.get(1));
                    }
                    bVar.f0(a11.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public int hashCode() {
        int hashCode = (527 + this.f12227n.hashCode()) * 31;
        String str = this.f12238o;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12239p;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": description=" + this.f12238o + ": value=" + this.f12239p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12227n);
        parcel.writeString(this.f12238o);
        parcel.writeString(this.f12239p);
    }
}
