.class final Lx5/a$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lx5/b0$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lx5/a$j;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;

.field private static final e:Lg6/c;

.field private static final f:Lg6/c;

.field private static final g:Lg6/c;

.field private static final h:Lg6/c;

.field private static final i:Lg6/c;

.field private static final j:Lg6/c;

.field private static final k:Lg6/c;

.field private static final l:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/a$j;

    invoke-direct {v0}, Lx5/a$j;-><init>()V

    sput-object v0, Lx5/a$j;->a:Lx5/a$j;

    const-string v0, "generator"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->b:Lg6/c;

    const-string v0, "identifier"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->c:Lg6/c;

    const-string v0, "startedAt"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->d:Lg6/c;

    const-string v0, "endedAt"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->e:Lg6/c;

    const-string v0, "crashed"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->f:Lg6/c;

    const-string v0, "app"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->g:Lg6/c;

    const-string v0, "user"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->h:Lg6/c;

    const-string v0, "os"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->i:Lg6/c;

    const-string v0, "device"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->j:Lg6/c;

    const-string v0, "events"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->k:Lg6/c;

    const-string v0, "generatorType"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$j;->l:Lg6/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lx5/b0$e;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lx5/a$j;->b(Lx5/b0$e;Lg6/e;)V

    return-void
.end method

.method public b(Lx5/b0$e;Lg6/e;)V
    .locals 3

    sget-object v0, Lx5/a$j;->b:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->c:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->i()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->d:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->k()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lg6/e;->e(Lg6/c;J)Lg6/e;

    sget-object v0, Lx5/a$j;->e:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->f:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->m()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lg6/e;->f(Lg6/c;Z)Lg6/e;

    sget-object v0, Lx5/a$j;->g:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->b()Lx5/b0$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->h:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->l()Lx5/b0$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->i:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->j()Lx5/b0$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->j:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->c()Lx5/b0$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->k:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->e()Lx5/c0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$j;->l:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e;->g()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lg6/e;->d(Lg6/c;I)Lg6/e;

    return-void
.end method
