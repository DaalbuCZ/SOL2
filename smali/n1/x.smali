.class public final Ln1/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Ln1/w;",
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
            "Lo1/d;",
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
            "Lp1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Ln1/y;",
            ">;",
            "Lx8/a<",
            "Lp1/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/x;->a:Lx8/a;

    iput-object p2, p0, Ln1/x;->b:Lx8/a;

    iput-object p3, p0, Ln1/x;->c:Lx8/a;

    iput-object p4, p0, Ln1/x;->d:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Ln1/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Ln1/y;",
            ">;",
            "Lx8/a<",
            "Lp1/b;",
            ">;)",
            "Ln1/x;"
        }
    .end annotation

    new-instance v0, Ln1/x;

    invoke-direct {v0, p0, p1, p2, p3}, Ln1/x;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lo1/d;Ln1/y;Lp1/b;)Ln1/w;
    .locals 1

    new-instance v0, Ln1/w;

    invoke-direct {v0, p0, p1, p2, p3}, Ln1/w;-><init>(Ljava/util/concurrent/Executor;Lo1/d;Ln1/y;Lp1/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Ln1/w;
    .locals 4

    iget-object v0, p0, Ln1/x;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ln1/x;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo1/d;

    iget-object v2, p0, Ln1/x;->c:Lx8/a;

    invoke-interface {v2}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln1/y;

    iget-object v3, p0, Ln1/x;->d:Lx8/a;

    invoke-interface {v3}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/b;

    invoke-static {v0, v1, v2, v3}, Ln1/x;->c(Ljava/util/concurrent/Executor;Lo1/d;Ln1/y;Lp1/b;)Ln1/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln1/x;->b()Ln1/w;

    move-result-object v0

    return-object v0
.end method
