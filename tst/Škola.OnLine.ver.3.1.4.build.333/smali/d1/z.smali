.class public Ld1/z;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/z$c;,
        Ld1/z$d;,
        Ld1/z$b;,
        Ld1/z$a;
    }
.end annotation


# instance fields
.field private a:Ld1/z$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Ld1/z$c;

    invoke-direct {v0, p1}, Ld1/z$c;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ld1/z$d;

    invoke-direct {v0, p1}, Ld1/z$d;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v0, p0, Ld1/z;->a:Ld1/z$a;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Ld1/z;->a:Ld1/z$a;

    invoke-interface {v0}, Ld1/z$a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Ld1/z;->a:Ld1/z$a;

    invoke-interface {v0}, Ld1/z$a;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Ld1/z;->a:Ld1/z$a;

    invoke-interface {v0}, Ld1/z$a;->c()J

    move-result-wide v0

    return-wide v0
.end method
