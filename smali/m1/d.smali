.class public final Lm1/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lm1/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lh1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/y;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lo1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lp1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lx8/a<",
            "Lh1/e;",
            ">;",
            "Lx8/a<",
            "Ln1/y;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Lp1/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/d;->a:Lx8/a;

    iput-object p2, p0, Lm1/d;->b:Lx8/a;

    iput-object p3, p0, Lm1/d;->c:Lx8/a;

    iput-object p4, p0, Lm1/d;->d:Lx8/a;

    iput-object p5, p0, Lm1/d;->e:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lm1/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lx8/a<",
            "Lh1/e;",
            ">;",
            "Lx8/a<",
            "Ln1/y;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Lp1/b;",
            ">;)",
            "Lm1/d;"
        }
    .end annotation

    new-instance v6, Lm1/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lm1/d;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;Lh1/e;Ln1/y;Lo1/d;Lp1/b;)Lm1/c;
    .locals 7

    new-instance v6, Lm1/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lm1/c;-><init>(Ljava/util/concurrent/Executor;Lh1/e;Ln1/y;Lo1/d;Lp1/b;)V

    return-object v6
.end method


# virtual methods
.method public b()Lm1/c;
    .locals 5

    iget-object v0, p0, Lm1/d;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lm1/d;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh1/e;

    iget-object v2, p0, Lm1/d;->c:Lx8/a;

    invoke-interface {v2}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln1/y;

    iget-object v3, p0, Lm1/d;->d:Lx8/a;

    invoke-interface {v3}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/d;

    iget-object v4, p0, Lm1/d;->e:Lx8/a;

    invoke-interface {v4}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/b;

    invoke-static {v0, v1, v2, v3, v4}, Lm1/d;->c(Ljava/util/concurrent/Executor;Lh1/e;Ln1/y;Lo1/d;Lp1/b;)Lm1/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm1/d;->b()Lm1/c;

    move-result-object v0

    return-object v0
.end method
