.class public Lg9/a;
.super Lf9/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf9/a;-><init>()V

    return-void
.end method

.method private final c(I)Z
    .locals 1

    sget-object v0, Lg9/a$a;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public b()Ll9/c;
    .locals 1

    const/16 v0, 0x18

    invoke-direct {p0, v0}, Lg9/a;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lm9/a;

    invoke-direct {v0}, Lm9/a;-><init>()V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Le9/a;->b()Ll9/c;

    move-result-object v0

    :goto_0
    return-object v0
.end method
