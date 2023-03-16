package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* loaded from: classes.dex */
public class r9 extends IOException {
    public r9(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q9 a() {
        return new q9("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r9 b() {
        return new r9("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r9 c() {
        return new r9("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r9 d() {
        return new r9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r9 e() {
        return new r9("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r9 f() {
        return new r9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
