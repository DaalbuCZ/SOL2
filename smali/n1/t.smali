.class public final Ln1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Ln1/s;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Landroid/content/Context;",
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
            "Lo1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/y;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lp1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lo1/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lh1/e;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Ln1/y;",
            ">;",
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lx8/a<",
            "Lp1/b;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lo1/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/t;->a:Lx8/a;

    iput-object p2, p0, Ln1/t;->b:Lx8/a;

    iput-object p3, p0, Ln1/t;->c:Lx8/a;

    iput-object p4, p0, Ln1/t;->d:Lx8/a;

    iput-object p5, p0, Ln1/t;->e:Lx8/a;

    iput-object p6, p0, Ln1/t;->f:Lx8/a;

    iput-object p7, p0, Ln1/t;->g:Lx8/a;

    iput-object p8, p0, Ln1/t;->h:Lx8/a;

    iput-object p9, p0, Ln1/t;->i:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Ln1/t;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lh1/e;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Ln1/y;",
            ">;",
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lx8/a<",
            "Lp1/b;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lo1/c;",
            ">;)",
            "Ln1/t;"
        }
    .end annotation

    new-instance v10, Ln1/t;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Ln1/t;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Lh1/e;Lo1/d;Ln1/y;Ljava/util/concurrent/Executor;Lp1/b;Lq1/a;Lq1/a;Lo1/c;)Ln1/s;
    .locals 11

    new-instance v10, Ln1/s;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Ln1/s;-><init>(Landroid/content/Context;Lh1/e;Lo1/d;Ln1/y;Ljava/util/concurrent/Executor;Lp1/b;Lq1/a;Lq1/a;Lo1/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Ln1/s;
    .locals 10

    iget-object v0, p0, Ln1/t;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Ln1/t;->b:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lh1/e;

    iget-object v0, p0, Ln1/t;->c:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo1/d;

    iget-object v0, p0, Ln1/t;->d:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ln1/y;

    iget-object v0, p0, Ln1/t;->e:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Ln1/t;->f:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lp1/b;

    iget-object v0, p0, Ln1/t;->g:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lq1/a;

    iget-object v0, p0, Ln1/t;->h:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lq1/a;

    iget-object v0, p0, Ln1/t;->i:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo1/c;

    invoke-static/range {v1 .. v9}, Ln1/t;->c(Landroid/content/Context;Lh1/e;Lo1/d;Ln1/y;Ljava/util/concurrent/Executor;Lp1/b;Lq1/a;Lq1/a;Lo1/c;)Ln1/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln1/t;->b()Ln1/s;

    move-result-object v0

    return-object v0
.end method
