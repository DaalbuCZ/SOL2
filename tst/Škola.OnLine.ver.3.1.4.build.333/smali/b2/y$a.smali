.class Lb2/y$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb2/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a()V
    .locals 0

    invoke-static {p0}, Lb2/x;->c(Lb2/y;)V

    return-void
.end method

.method public synthetic c()V
    .locals 0

    invoke-static {p0}, Lb2/x;->b(Lb2/y;)V

    return-void
.end method

.method public d(Lb2/w$a;Lx1/n1;)Lb2/o;
    .locals 2

    iget-object p1, p2, Lx1/n1;->B:Lb2/m;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lb2/e0;

    new-instance p2, Lb2/o$a;

    new-instance v0, Lb2/p0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb2/p0;-><init>(I)V

    const/16 v1, 0x1771

    invoke-direct {p2, v0, v1}, Lb2/o$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p1, p2}, Lb2/e0;-><init>(Lb2/o$a;)V

    return-object p1
.end method

.method public e(Landroid/os/Looper;Ly1/t1;)V
    .locals 0

    return-void
.end method

.method public f(Lx1/n1;)I
    .locals 0

    iget-object p1, p1, Lx1/n1;->B:Lb2/m;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public synthetic g(Lb2/w$a;Lx1/n1;)Lb2/y$b;
    .locals 0

    invoke-static {p0, p1, p2}, Lb2/x;->a(Lb2/y;Lb2/w$a;Lx1/n1;)Lb2/y$b;

    move-result-object p1

    return-object p1
.end method
