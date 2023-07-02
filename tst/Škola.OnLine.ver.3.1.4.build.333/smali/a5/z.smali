.class final La5/z;
.super La5/t;
.source ""


# instance fields
.field final synthetic o:Landroid/os/IBinder;

.field final synthetic p:La5/c0;


# direct methods
.method constructor <init>(La5/c0;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, La5/z;->p:La5/c0;

    iput-object p2, p0, La5/z;->o:Landroid/os/IBinder;

    invoke-direct {p0}, La5/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, La5/z;->p:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    iget-object v1, p0, La5/z;->o:Landroid/os/IBinder;

    invoke-static {v1}, La5/k;->e(Landroid/os/IBinder;)La5/l;

    move-result-object v1

    invoke-static {v0, v1}, La5/d0;->k(La5/d0;Landroid/os/IInterface;)V

    iget-object v0, p0, La5/z;->p:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    invoke-static {v0}, La5/d0;->n(La5/d0;)V

    iget-object v0, p0, La5/z;->p:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La5/d0;->j(La5/d0;Z)V

    iget-object v0, p0, La5/z;->p:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    invoke-static {v0}, La5/d0;->g(La5/d0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La5/z;->p:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    invoke-static {v0}, La5/d0;->g(La5/d0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
