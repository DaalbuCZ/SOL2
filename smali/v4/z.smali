.class final Lv4/z;
.super Lv4/t;
.source ""


# instance fields
.field final synthetic o:Landroid/os/IBinder;

.field final synthetic p:Lv4/c0;


# direct methods
.method constructor <init>(Lv4/c0;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lv4/z;->p:Lv4/c0;

    iput-object p2, p0, Lv4/z;->o:Landroid/os/IBinder;

    invoke-direct {p0}, Lv4/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lv4/z;->p:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    iget-object v1, p0, Lv4/z;->o:Landroid/os/IBinder;

    invoke-static {v1}, Lv4/k;->e(Landroid/os/IBinder;)Lv4/l;

    move-result-object v1

    invoke-static {v0, v1}, Lv4/d0;->k(Lv4/d0;Landroid/os/IInterface;)V

    iget-object v0, p0, Lv4/z;->p:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->n(Lv4/d0;)V

    iget-object v0, p0, Lv4/z;->p:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv4/d0;->j(Lv4/d0;Z)V

    iget-object v0, p0, Lv4/z;->p:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->g(Lv4/d0;)Ljava/util/List;

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
    iget-object v0, p0, Lv4/z;->p:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->g(Lv4/d0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
