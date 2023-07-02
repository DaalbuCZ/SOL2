.class Lb2/h$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb2/y$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private final b:Lb2/w$a;

.field private c:Lb2/o;

.field private d:Z

.field final synthetic e:Lb2/h;


# direct methods
.method public constructor <init>(Lb2/h;Lb2/w$a;)V
    .locals 0

    iput-object p1, p0, Lb2/h$f;->e:Lb2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb2/h$f;->b:Lb2/w$a;

    return-void
.end method

.method public static synthetic b(Lb2/h$f;)V
    .locals 0

    invoke-direct {p0}, Lb2/h$f;->f()V

    return-void
.end method

.method public static synthetic c(Lb2/h$f;Lx1/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/h$f;->e(Lx1/n1;)V

    return-void
.end method

.method private synthetic e(Lx1/n1;)V
    .locals 4

    iget-object v0, p0, Lb2/h$f;->e:Lb2/h;

    invoke-static {v0}, Lb2/h;->r(Lb2/h;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lb2/h$f;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb2/h$f;->e:Lb2/h;

    invoke-static {v0}, Lb2/h;->l(Lb2/h;)Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    iget-object v2, p0, Lb2/h$f;->b:Lb2/w$a;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lb2/h;->m(Lb2/h;Landroid/os/Looper;Lb2/w$a;Lx1/n1;Z)Lb2/o;

    move-result-object p1

    iput-object p1, p0, Lb2/h$f;->c:Lb2/o;

    iget-object p1, p0, Lb2/h$f;->e:Lb2/h;

    invoke-static {p1}, Lb2/h;->k(Lb2/h;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic f()V
    .locals 2

    iget-boolean v0, p0, Lb2/h$f;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lb2/h$f;->c:Lb2/o;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lb2/h$f;->b:Lb2/w$a;

    invoke-interface {v0, v1}, Lb2/o;->b(Lb2/w$a;)V

    :cond_1
    iget-object v0, p0, Lb2/h$f;->e:Lb2/h;

    invoke-static {v0}, Lb2/h;->k(Lb2/h;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb2/h$f;->d:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lb2/h$f;->e:Lb2/h;

    invoke-static {v0}, Lb2/h;->q(Lb2/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lb2/i;

    invoke-direct {v1, p0}, Lb2/i;-><init>(Lb2/h$f;)V

    invoke-static {v0, v1}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d(Lx1/n1;)V
    .locals 2

    iget-object v0, p0, Lb2/h$f;->e:Lb2/h;

    invoke-static {v0}, Lb2/h;->q(Lb2/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lb2/j;

    invoke-direct {v1, p0, p1}, Lb2/j;-><init>(Lb2/h$f;Lx1/n1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
