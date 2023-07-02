.class public Ld1/q3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Ld1/f2;

.field private final o:Ld1/c3;

.field private final p:Ld1/j3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ld1/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/h2<",
            "Ld1/k3;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ld1/s2;


# direct methods
.method public constructor <init>(Ld1/f2;Ld1/c3;Ld1/j3;Ld1/h2;Ld1/s2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/f2;",
            "Ld1/c3;",
            "Ld1/j3<",
            "Ljava/lang/String;",
            ">;",
            "Ld1/h2<",
            "Ld1/k3;",
            ">;",
            "Ld1/s2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/q3;->n:Ld1/f2;

    iput-object p2, p0, Ld1/q3;->o:Ld1/c3;

    iput-object p3, p0, Ld1/q3;->p:Ld1/j3;

    iput-object p4, p0, Ld1/q3;->q:Ld1/h2;

    iput-object p5, p0, Ld1/q3;->r:Ld1/s2;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Ld1/q3;->n:Ld1/f2;

    iget-object v1, p0, Ld1/q3;->o:Ld1/c3;

    invoke-virtual {v1}, Ld1/c3;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ld1/q3;->o:Ld1/c3;

    iget-object v3, p0, Ld1/q3;->p:Ld1/j3;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ld1/j3;->a(Z)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Ld1/f2;->b(Ljava/lang/String;Ld1/c3;Ljava/util/Map;)Ld1/k3;

    move-result-object v0

    iget-object v1, p0, Ld1/q3;->r:Ld1/s2;

    invoke-interface {v1, v0}, Ld1/s2;->l(Ld1/k3;)V

    iget-object v1, p0, Ld1/q3;->q:Ld1/h2;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ld1/h2;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ld1/v0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Ld1/q3;->q:Ld1/h2;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ld1/h2;->b(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
