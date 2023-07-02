.class public final Lw6/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf9/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf9/a;"
    }
.end annotation


# instance fields
.field private final a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lk5/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lo6/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ln6/b<",
            "Lj1/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Lk5/e;",
            ">;",
            "Lf9/a<",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;",
            "Lf9/a<",
            "Lo6/e;",
            ">;",
            "Lf9/a<",
            "Ln6/b<",
            "Lj1/g;",
            ">;>;",
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;",
            "Lf9/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/g;->a:Lf9/a;

    iput-object p2, p0, Lw6/g;->b:Lf9/a;

    iput-object p3, p0, Lw6/g;->c:Lf9/a;

    iput-object p4, p0, Lw6/g;->d:Lf9/a;

    iput-object p5, p0, Lw6/g;->e:Lf9/a;

    iput-object p6, p0, Lw6/g;->f:Lf9/a;

    iput-object p7, p0, Lw6/g;->g:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Lw6/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Lk5/e;",
            ">;",
            "Lf9/a<",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;",
            "Lf9/a<",
            "Lo6/e;",
            ">;",
            "Lf9/a<",
            "Ln6/b<",
            "Lj1/g;",
            ">;>;",
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;",
            "Lf9/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)",
            "Lw6/g;"
        }
    .end annotation

    new-instance v8, Lw6/g;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lw6/g;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v8
.end method

.method public static c(Lk5/e;Ln6/b;Lo6/e;Ln6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)Lw6/e;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/e;",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Lo6/e;",
            "Ln6/b<",
            "Lj1/g;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "Lcom/google/firebase/perf/config/a;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")",
            "Lw6/e;"
        }
    .end annotation

    new-instance v8, Lw6/e;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lw6/e;-><init>(Lk5/e;Ln6/b;Lo6/e;Ln6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)V

    return-object v8
.end method


# virtual methods
.method public b()Lw6/e;
    .locals 8

    iget-object v0, p0, Lw6/g;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lk5/e;

    iget-object v0, p0, Lw6/g;->b:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ln6/b;

    iget-object v0, p0, Lw6/g;->c:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo6/e;

    iget-object v0, p0, Lw6/g;->d:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ln6/b;

    iget-object v0, p0, Lw6/g;->e:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/firebase/perf/config/RemoteConfigManager;

    iget-object v0, p0, Lw6/g;->f:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/firebase/perf/config/a;

    iget-object v0, p0, Lw6/g;->g:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/firebase/perf/session/SessionManager;

    invoke-static/range {v1 .. v7}, Lw6/g;->c(Lk5/e;Ln6/b;Lo6/e;Ln6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)Lw6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw6/g;->b()Lw6/e;

    move-result-object v0

    return-object v0
.end method
