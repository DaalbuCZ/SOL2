.class public final Lr6/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx8/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx8/a;"
    }
.end annotation


# instance fields
.field private final a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lf5/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Li6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lj6/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Li6/b<",
            "Le1/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lf5/e;",
            ">;",
            "Lx8/a<",
            "Li6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;",
            "Lx8/a<",
            "Lj6/e;",
            ">;",
            "Lx8/a<",
            "Li6/b<",
            "Le1/g;",
            ">;>;",
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;",
            "Lx8/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/g;->a:Lx8/a;

    iput-object p2, p0, Lr6/g;->b:Lx8/a;

    iput-object p3, p0, Lr6/g;->c:Lx8/a;

    iput-object p4, p0, Lr6/g;->d:Lx8/a;

    iput-object p5, p0, Lr6/g;->e:Lx8/a;

    iput-object p6, p0, Lr6/g;->f:Lx8/a;

    iput-object p7, p0, Lr6/g;->g:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lr6/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lf5/e;",
            ">;",
            "Lx8/a<",
            "Li6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;",
            "Lx8/a<",
            "Lj6/e;",
            ">;",
            "Lx8/a<",
            "Li6/b<",
            "Le1/g;",
            ">;>;",
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;",
            "Lx8/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)",
            "Lr6/g;"
        }
    .end annotation

    new-instance v8, Lr6/g;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lr6/g;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v8
.end method

.method public static c(Lf5/e;Li6/b;Lj6/e;Li6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)Lr6/e;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/e;",
            "Li6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Lj6/e;",
            "Li6/b<",
            "Le1/g;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "Lcom/google/firebase/perf/config/a;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")",
            "Lr6/e;"
        }
    .end annotation

    new-instance v8, Lr6/e;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lr6/e;-><init>(Lf5/e;Li6/b;Lj6/e;Li6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)V

    return-object v8
.end method


# virtual methods
.method public b()Lr6/e;
    .locals 8

    iget-object v0, p0, Lr6/g;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf5/e;

    iget-object v0, p0, Lr6/g;->b:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Li6/b;

    iget-object v0, p0, Lr6/g;->c:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lj6/e;

    iget-object v0, p0, Lr6/g;->d:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Li6/b;

    iget-object v0, p0, Lr6/g;->e:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/firebase/perf/config/RemoteConfigManager;

    iget-object v0, p0, Lr6/g;->f:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/firebase/perf/config/a;

    iget-object v0, p0, Lr6/g;->g:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/firebase/perf/session/SessionManager;

    invoke-static/range {v1 .. v7}, Lr6/g;->c(Lf5/e;Li6/b;Lj6/e;Li6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)Lr6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr6/g;->b()Lr6/e;

    move-result-object v0

    return-object v0
.end method
