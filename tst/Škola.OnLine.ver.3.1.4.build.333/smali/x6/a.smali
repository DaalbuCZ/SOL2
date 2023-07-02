.class public final Lx6/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/a$b;
    }
.end annotation


# instance fields
.field private a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lk5/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lo6/e;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ln6/b<",
            "Lj1/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lw6/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ly6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lx6/a;->c(Ly6/a;)V

    return-void
.end method

.method synthetic constructor <init>(Ly6/a;Lx6/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/a;-><init>(Ly6/a;)V

    return-void
.end method

.method public static b()Lx6/a$b;
    .locals 2

    new-instance v0, Lx6/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx6/a$b;-><init>(Lx6/a$a;)V

    return-object v0
.end method

.method private c(Ly6/a;)V
    .locals 8

    invoke-static {p1}, Ly6/c;->a(Ly6/a;)Ly6/c;

    move-result-object v0

    iput-object v0, p0, Lx6/a;->a:Lf9/a;

    invoke-static {p1}, Ly6/e;->a(Ly6/a;)Ly6/e;

    move-result-object v0

    iput-object v0, p0, Lx6/a;->b:Lf9/a;

    invoke-static {p1}, Ly6/d;->a(Ly6/a;)Ly6/d;

    move-result-object v0

    iput-object v0, p0, Lx6/a;->c:Lf9/a;

    invoke-static {p1}, Ly6/h;->a(Ly6/a;)Ly6/h;

    move-result-object v0

    iput-object v0, p0, Lx6/a;->d:Lf9/a;

    invoke-static {p1}, Ly6/f;->a(Ly6/a;)Ly6/f;

    move-result-object v0

    iput-object v0, p0, Lx6/a;->e:Lf9/a;

    invoke-static {p1}, Ly6/b;->a(Ly6/a;)Ly6/b;

    move-result-object v0

    iput-object v0, p0, Lx6/a;->f:Lf9/a;

    invoke-static {p1}, Ly6/g;->a(Ly6/a;)Ly6/g;

    move-result-object v7

    iput-object v7, p0, Lx6/a;->g:Lf9/a;

    iget-object v1, p0, Lx6/a;->a:Lf9/a;

    iget-object v2, p0, Lx6/a;->b:Lf9/a;

    iget-object v3, p0, Lx6/a;->c:Lf9/a;

    iget-object v4, p0, Lx6/a;->d:Lf9/a;

    iget-object v5, p0, Lx6/a;->e:Lf9/a;

    iget-object v6, p0, Lx6/a;->f:Lf9/a;

    invoke-static/range {v1 .. v7}, Lw6/g;->a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Lw6/g;

    move-result-object p1

    invoke-static {p1}, Lz7/a;->a(Lf9/a;)Lf9/a;

    move-result-object p1

    iput-object p1, p0, Lx6/a;->h:Lf9/a;

    return-void
.end method


# virtual methods
.method public a()Lw6/e;
    .locals 1

    iget-object v0, p0, Lx6/a;->h:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw6/e;

    return-object v0
.end method
