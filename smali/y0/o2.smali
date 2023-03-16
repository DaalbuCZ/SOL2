.class public Ly0/o2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private final n:Ly0/j3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ly0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final p:Ly0/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/h2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly0/j3;Ly0/q;Ly0/h2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;",
            "Ly0/q<",
            "TT;>;",
            "Ly0/h2<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/o2;->n:Ly0/j3;

    iput-object p2, p0, Ly0/o2;->o:Ly0/q;

    iput-object p3, p0, Ly0/o2;->p:Ly0/h2;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v0}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/o2;->n:Ly0/j3;

    iget-object v1, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v1}, Ly0/q;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v2}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-interface {v0, v1, v2}, Ly0/j3;->e(Ljava/lang/Object;Ljava/lang/Float;)Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v0}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly0/o2;->n:Ly0/j3;

    iget-object v1, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v1}, Ly0/q;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v2}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ly0/j3;->f(Ljava/lang/Object;Ljava/lang/Integer;)Z

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v0}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ly0/o2;->n:Ly0/j3;

    iget-object v1, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v1}, Ly0/q;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v2}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ly0/j3;->c(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v0}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ly0/o2;->n:Ly0/j3;

    iget-object v1, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v1}, Ly0/q;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ly0/o2;->o:Ly0/q;

    invoke-virtual {v2}, Ly0/q;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ly0/j3;->h(Ljava/lang/Object;Ljava/lang/Boolean;)Z

    move-result v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ly0/o2;->p:Ly0/h2;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Ly0/h2;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ly0/o2;->p:Ly0/h2;

    invoke-interface {v1, v0}, Ly0/h2;->b(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
