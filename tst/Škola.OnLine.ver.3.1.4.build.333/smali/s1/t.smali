.class public final Ls1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Ls1/s;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Landroid/content/Context;",
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
            "Lt1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ls1/y;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lu1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lt1/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lm1/e;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Ls1/y;",
            ">;",
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lf9/a<",
            "Lu1/b;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lt1/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/t;->a:Lf9/a;

    iput-object p2, p0, Ls1/t;->b:Lf9/a;

    iput-object p3, p0, Ls1/t;->c:Lf9/a;

    iput-object p4, p0, Ls1/t;->d:Lf9/a;

    iput-object p5, p0, Ls1/t;->e:Lf9/a;

    iput-object p6, p0, Ls1/t;->f:Lf9/a;

    iput-object p7, p0, Ls1/t;->g:Lf9/a;

    iput-object p8, p0, Ls1/t;->h:Lf9/a;

    iput-object p9, p0, Ls1/t;->i:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Ls1/t;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lm1/e;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Ls1/y;",
            ">;",
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lf9/a<",
            "Lu1/b;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lt1/c;",
            ">;)",
            "Ls1/t;"
        }
    .end annotation

    new-instance v10, Ls1/t;

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

    invoke-direct/range {v0 .. v9}, Ls1/t;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Lm1/e;Lt1/d;Ls1/y;Ljava/util/concurrent/Executor;Lu1/b;Lv1/a;Lv1/a;Lt1/c;)Ls1/s;
    .locals 11

    new-instance v10, Ls1/s;

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

    invoke-direct/range {v0 .. v9}, Ls1/s;-><init>(Landroid/content/Context;Lm1/e;Lt1/d;Ls1/y;Ljava/util/concurrent/Executor;Lu1/b;Lv1/a;Lv1/a;Lt1/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Ls1/s;
    .locals 10

    iget-object v0, p0, Ls1/t;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Ls1/t;->b:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lm1/e;

    iget-object v0, p0, Ls1/t;->c:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lt1/d;

    iget-object v0, p0, Ls1/t;->d:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ls1/y;

    iget-object v0, p0, Ls1/t;->e:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Ls1/t;->f:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lu1/b;

    iget-object v0, p0, Ls1/t;->g:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lv1/a;

    iget-object v0, p0, Ls1/t;->h:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lv1/a;

    iget-object v0, p0, Ls1/t;->i:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lt1/c;

    invoke-static/range {v1 .. v9}, Ls1/t;->c(Landroid/content/Context;Lm1/e;Lt1/d;Ls1/y;Ljava/util/concurrent/Executor;Lu1/b;Lv1/a;Lv1/a;Lt1/c;)Ls1/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls1/t;->b()Ls1/s;

    move-result-object v0

    return-object v0
.end method
