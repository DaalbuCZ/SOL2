.class public Ld1/h0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ld1/z2;->i:I

    add-int/lit16 v0, v0, -0x400

    sput v0, Ld1/h0;->a:I

    return-void
.end method

.method private static a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, p1

    mul-long/2addr v0, v2

    long-to-double v0, v0

    invoke-static {p0}, Ld1/a3;->b(Ljava/lang/String;)I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ld1/a3;->b(Ljava/lang/String;)I

    move-result v0

    if-le v0, p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Ld1/a3;->b(Ljava/lang/String;)I

    move-result p0

    sget v0, Ld1/h0;->a:I

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "\u2026"

    invoke-static {v0}, Ld1/a3;->a(Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget v3, Ld1/h0;->a:I

    sub-int/2addr v3, v1

    invoke-static {p0, v3}, Ld1/h0;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static d(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ld1/h0;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1}, Ld1/h0;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_5

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x7f

    const/4 v5, 0x1

    if-gt v3, v4, :cond_0

    move v4, v0

    move v3, v5

    goto :goto_3

    :cond_0
    const/16 v4, 0x7ff

    if-gt v3, v4, :cond_1

    const/4 v3, 0x2

    :goto_1
    move v4, v0

    goto :goto_3

    :cond_1
    const v4, 0xd7ff

    if-gt v3, v4, :cond_2

    goto :goto_2

    :cond_2
    const v4, 0xdfff

    if-gt v3, v4, :cond_3

    const/4 v3, 0x4

    move v4, v5

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v3, 0x3

    goto :goto_1

    :goto_3
    add-int/2addr v2, v3

    if-le v2, p1, :cond_4

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    add-int/2addr v1, v4

    add-int/2addr v1, v5

    goto :goto_0

    :cond_5
    return-object p0
.end method
