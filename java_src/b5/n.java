package b5;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
final class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(@CheckForNull Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
