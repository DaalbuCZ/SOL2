.class public final Ls6/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/a$b;
    }
.end annotation


# instance fields
.field private a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lf5/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Li6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lj6/e;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Li6/b<",
            "Le1/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lr6/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lt6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Ls6/a;->c(Lt6/a;)V

    return-void
.end method

.method synthetic constructor <init>(Lt6/a;Ls6/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls6/a;-><init>(Lt6/a;)V

    return-void
.end method

.method public static b()Ls6/a$b;
    .locals 2

    new-instance v0, Ls6/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls6/a$b;-><init>(Ls6/a$a;)V

    return-object v0
.end method

.method private c(Lt6/a;)V
    .locals 8

    invoke-static {p1}, Lt6/c;->a(Lt6/a;)Lt6/c;

    move-result-object v0

    iput-object v0, p0, Ls6/a;->a:Lx8/a;

    invoke-static {p1}, Lt6/e;->a(Lt6/a;)Lt6/e;

    move-result-object v0

    iput-object v0, p0, Ls6/a;->b:Lx8/a;

    invoke-static {p1}, Lt6/d;->a(Lt6/a;)Lt6/d;

    move-result-object v0

    iput-object v0, p0, Ls6/a;->c:Lx8/a;

    invoke-static {p1}, Lt6/h;->a(Lt6/a;)Lt6/h;

    move-result-object v0

    iput-object v0, p0, Ls6/a;->d:Lx8/a;

    invoke-static {p1}, Lt6/f;->a(Lt6/a;)Lt6/f;

    move-result-object v0

    iput-object v0, p0, Ls6/a;->e:Lx8/a;

    invoke-static {p1}, Lt6/b;->a(Lt6/a;)Lt6/b;

    move-result-object v0

    iput-object v0, p0, Ls6/a;->f:Lx8/a;

    invoke-static {p1}, Lt6/g;->a(Lt6/a;)Lt6/g;

    move-result-object v7

    iput-object v7, p0, Ls6/a;->g:Lx8/a;

    iget-object v1, p0, Ls6/a;->a:Lx8/a;

    iget-object v2, p0, Ls6/a;->b:Lx8/a;

    iget-object v3, p0, Ls6/a;->c:Lx8/a;

    iget-object v4, p0, Ls6/a;->d:Lx8/a;

    iget-object v5, p0, Ls6/a;->e:Lx8/a;

    iget-object v6, p0, Ls6/a;->f:Lx8/a;

    invoke-static/range {v1 .. v7}, Lr6/g;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lr6/g;

    move-result-object p1

    invoke-static {p1}, Lr7/a;->a(Lx8/a;)Lx8/a;

    move-result-object p1

    iput-object p1, p0, Ls6/a;->h:Lx8/a;

    return-void
.end method


# virtual methods
.method public a()Lr6/e;
    .locals 1

    iget-object v0, p0, Ls6/a;->h:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/e;

    return-object v0
.end method
