.class public Ld1/p0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static a([BILjava/nio/ByteOrder;)J
    .locals 8

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    const-wide/16 v1, 0xff

    const/16 v3, 0x8

    const-wide/16 v4, 0x0

    if-ne p2, v0, :cond_0

    move p2, p1

    :goto_0
    add-int/lit8 v0, p1, 0x8

    if-ge p2, v0, :cond_1

    shl-long/2addr v4, v3

    aget-byte v0, p0, p2

    int-to-long v6, v0

    and-long/2addr v6, v1

    or-long/2addr v4, v6

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p1, 0x7

    :goto_1
    if-lt p2, p1, :cond_1

    shl-long/2addr v4, v3

    aget-byte v0, p0, p2

    int-to-long v6, v0

    and-long/2addr v6, v1

    or-long/2addr v4, v6

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_1
    return-wide v4
.end method

.method public static b(Ljava/util/UUID;Ljava/lang/String;)Ljava/util/UUID;
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p0, p1}, Ld1/p0;->c(Ljava/util/UUID;[B)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/UUID;[B)Ljava/util/UUID;
    .locals 4

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    const-string v0, "SHA-1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    if-nez p0, :cond_0

    const/16 p0, 0x10

    new-array p0, p0, [B

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v1

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v1, v2, v3}, Ld1/p0;->f(JLjava/nio/ByteOrder;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-static {v1, v2, v3}, Ld1/p0;->f(JLjava/nio/ByteOrder;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    :goto_0
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    const/4 p1, 0x5

    invoke-static {p0, p1}, Ld1/p0;->d([BI)Ljava/util/UUID;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method static d([BI)Ljava/util/UUID;
    .locals 7

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ld1/p0;->a([BILjava/nio/ByteOrder;)J

    move-result-wide v1

    const/16 v3, 0x8

    invoke-static {p0, v3, v0}, Ld1/p0;->a([BILjava/nio/ByteOrder;)J

    move-result-wide v3

    const-wide/32 v5, -0xf001

    and-long v0, v1, v5

    int-to-long p0, p1

    const/16 v2, 0xc

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    and-long/2addr v0, v3

    const-wide/high16 v2, -0x8000000000000000L

    or-long/2addr v0, v2

    new-instance v2, Ljava/util/UUID;

    invoke-direct {v2, p0, p1, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    return-object v2
.end method

.method static e(J[BILjava/nio/ByteOrder;)V
    .locals 6

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    const-wide/16 v1, 0xff

    const/16 v3, 0x8

    if-ne p4, v0, :cond_0

    add-int/lit8 p4, p3, 0x7

    :goto_0
    if-lt p4, p3, :cond_1

    and-long v4, p0, v1

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, p2, p4

    shr-long/2addr p0, v3

    add-int/lit8 p4, p4, -0x1

    goto :goto_0

    :cond_0
    move p4, p3

    :goto_1
    add-int/lit8 v0, p3, 0x8

    if-ge p4, v0, :cond_1

    and-long v4, p0, v1

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, p2, p4

    shr-long/2addr p0, v3

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method static f(JLjava/nio/ByteOrder;)[B
    .locals 2

    const/16 v0, 0x8

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ld1/p0;->e(J[BILjava/nio/ByteOrder;)V

    return-object v0
.end method

.method public static g(Ljava/util/UUID;)Ljava/util/UUID;
    .locals 1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ld1/p0;->b(Ljava/util/UUID;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method
