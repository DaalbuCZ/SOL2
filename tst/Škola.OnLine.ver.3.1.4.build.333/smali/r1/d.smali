.class public final Lr1/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Lr1/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lm1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ls1/y;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lt1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lu1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lf9/a<",
            "Lm1/e;",
            ">;",
            "Lf9/a<",
            "Ls1/y;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Lu1/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/d;->a:Lf9/a;

    iput-object p2, p0, Lr1/d;->b:Lf9/a;

    iput-object p3, p0, Lr1/d;->c:Lf9/a;

    iput-object p4, p0, Lr1/d;->d:Lf9/a;

    iput-object p5, p0, Lr1/d;->e:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Lr1/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lf9/a<",
            "Lm1/e;",
            ">;",
            "Lf9/a<",
            "Ls1/y;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Lu1/b;",
            ">;)",
            "Lr1/d;"
        }
    .end annotation

    new-instance v6, Lr1/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lr1/d;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;Lm1/e;Ls1/y;Lt1/d;Lu1/b;)Lr1/c;
    .locals 7

    new-instance v6, Lr1/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lr1/c;-><init>(Ljava/util/concurrent/Executor;Lm1/e;Ls1/y;Lt1/d;Lu1/b;)V

    return-object v6
.end method


# virtual methods
.method public b()Lr1/c;
    .locals 5

    iget-object v0, p0, Lr1/d;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lr1/d;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/e;

    iget-object v2, p0, Lr1/d;->c:Lf9/a;

    invoke-interface {v2}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/y;

    iget-object v3, p0, Lr1/d;->d:Lf9/a;

    invoke-interface {v3}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt1/d;

    iget-object v4, p0, Lr1/d;->e:Lf9/a;

    invoke-interface {v4}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu1/b;

    invoke-static {v0, v1, v2, v3, v4}, Lr1/d;->c(Ljava/util/concurrent/Executor;Lm1/e;Ls1/y;Lt1/d;Lu1/b;)Lr1/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr1/d;->b()Lr1/c;

    move-result-object v0

    return-object v0
.end method
