.class public final Ld/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Ld/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ld/d$f;)Ljava/lang/String;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ld/d$c;

    if-eqz v0, :cond_0

    const-string p1, "image/*"

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ld/d$e;

    if-eqz v0, :cond_1

    const-string p1, "video/*"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ld/d$d;

    if-eqz v0, :cond_2

    check-cast p1, Ld/d$d;

    invoke-virtual {p1}, Ld/d$d;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of p1, p1, Ld/d$b;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Lg9/k;

    invoke-direct {p1}, Lg9/k;-><init>()V

    throw p1
.end method

.method public final b()Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure",
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x21

    if-lt v0, v3, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    const/16 v3, 0x1e

    if-lt v0, v3, :cond_1

    invoke-static {v3}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    move-result v0

    const/4 v3, 0x2

    if-lt v0, v3, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method
