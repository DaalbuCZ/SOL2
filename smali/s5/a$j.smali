.class final Ls5/a$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Ls5/b0$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ls5/a$j;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;

.field private static final e:Lb6/c;

.field private static final f:Lb6/c;

.field private static final g:Lb6/c;

.field private static final h:Lb6/c;

.field private static final i:Lb6/c;

.field private static final j:Lb6/c;

.field private static final k:Lb6/c;

.field private static final l:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls5/a$j;

    invoke-direct {v0}, Ls5/a$j;-><init>()V

    sput-object v0, Ls5/a$j;->a:Ls5/a$j;

    const-string v0, "generator"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->b:Lb6/c;

    const-string v0, "identifier"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->c:Lb6/c;

    const-string v0, "startedAt"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->d:Lb6/c;

    const-string v0, "endedAt"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->e:Lb6/c;

    const-string v0, "crashed"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->f:Lb6/c;

    const-string v0, "app"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->g:Lb6/c;

    const-string v0, "user"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->h:Lb6/c;

    const-string v0, "os"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->i:Lb6/c;

    const-string v0, "device"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->j:Lb6/c;

    const-string v0, "events"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->k:Lb6/c;

    const-string v0, "generatorType"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$j;->l:Lb6/c;

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

    check-cast p1, Ls5/b0$e;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Ls5/a$j;->b(Ls5/b0$e;Lb6/e;)V

    return-void
.end method

.method public b(Ls5/b0$e;Lb6/e;)V
    .locals 3

    sget-object v0, Ls5/a$j;->b:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->c:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->i()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->d:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->k()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Ls5/a$j;->e:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->f:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->m()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->a(Lb6/c;Z)Lb6/e;

    sget-object v0, Ls5/a$j;->g:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->b()Ls5/b0$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->h:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->l()Ls5/b0$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->i:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->j()Ls5/b0$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->j:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->c()Ls5/b0$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->k:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->e()Ls5/c0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$j;->l:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e;->g()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    return-void
.end method
