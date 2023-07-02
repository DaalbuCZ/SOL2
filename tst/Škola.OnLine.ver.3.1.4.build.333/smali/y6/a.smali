.class public Ly6/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lk5/e;

.field private final b:Lo6/e;

.field private final c:Ln6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ln6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/b<",
            "Lj1/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk5/e;Lo6/e;Ln6/b;Ln6/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/e;",
            "Lo6/e;",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Ln6/b<",
            "Lj1/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/a;->a:Lk5/e;

    iput-object p2, p0, Ly6/a;->b:Lo6/e;

    iput-object p3, p0, Ly6/a;->c:Ln6/b;

    iput-object p4, p0, Ly6/a;->d:Ln6/b;

    return-void
.end method


# virtual methods
.method a()Lcom/google/firebase/perf/config/a;
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    return-object v0
.end method

.method b()Lk5/e;
    .locals 1

    iget-object v0, p0, Ly6/a;->a:Lk5/e;

    return-object v0
.end method

.method c()Lo6/e;
    .locals 1

    iget-object v0, p0, Ly6/a;->b:Lo6/e;

    return-object v0
.end method

.method d()Ln6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly6/a;->c:Ln6/b;

    return-object v0
.end method

.method e()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;

    move-result-object v0

    return-object v0
.end method

.method f()Lcom/google/firebase/perf/session/SessionManager;
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    return-object v0
.end method

.method g()Ln6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln6/b<",
            "Lj1/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly6/a;->d:Ln6/b;

    return-object v0
.end method
