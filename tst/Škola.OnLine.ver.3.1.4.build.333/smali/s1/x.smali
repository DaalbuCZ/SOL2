.class public final Ls1/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Ls1/w;",
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
            "Lt1/d;",
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
            "Lu1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Ls1/y;",
            ">;",
            "Lf9/a<",
            "Lu1/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/x;->a:Lf9/a;

    iput-object p2, p0, Ls1/x;->b:Lf9/a;

    iput-object p3, p0, Ls1/x;->c:Lf9/a;

    iput-object p4, p0, Ls1/x;->d:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Ls1/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Ls1/y;",
            ">;",
            "Lf9/a<",
            "Lu1/b;",
            ">;)",
            "Ls1/x;"
        }
    .end annotation

    new-instance v0, Ls1/x;

    invoke-direct {v0, p0, p1, p2, p3}, Ls1/x;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lt1/d;Ls1/y;Lu1/b;)Ls1/w;
    .locals 1

    new-instance v0, Ls1/w;

    invoke-direct {v0, p0, p1, p2, p3}, Ls1/w;-><init>(Ljava/util/concurrent/Executor;Lt1/d;Ls1/y;Lu1/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Ls1/w;
    .locals 4

    iget-object v0, p0, Ls1/x;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ls1/x;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt1/d;

    iget-object v2, p0, Ls1/x;->c:Lf9/a;

    invoke-interface {v2}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/y;

    iget-object v3, p0, Ls1/x;->d:Lf9/a;

    invoke-interface {v3}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/b;

    invoke-static {v0, v1, v2, v3}, Ls1/x;->c(Ljava/util/concurrent/Executor;Lt1/d;Ls1/y;Lu1/b;)Ls1/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls1/x;->b()Ls1/w;

    move-result-object v0

    return-object v0
.end method
