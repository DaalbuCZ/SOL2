.class final Ls5/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Ls5/b0$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ls5/a$b;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;

.field private static final e:Lb6/c;

.field private static final f:Lb6/c;

.field private static final g:Lb6/c;

.field private static final h:Lb6/c;

.field private static final i:Lb6/c;

.field private static final j:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls5/a$b;

    invoke-direct {v0}, Ls5/a$b;-><init>()V

    sput-object v0, Ls5/a$b;->a:Ls5/a$b;

    const-string v0, "pid"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->b:Lb6/c;

    const-string v0, "processName"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->c:Lb6/c;

    const-string v0, "reasonCode"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->d:Lb6/c;

    const-string v0, "importance"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->e:Lb6/c;

    const-string v0, "pss"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->f:Lb6/c;

    const-string v0, "rss"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->g:Lb6/c;

    const-string v0, "timestamp"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->h:Lb6/c;

    const-string v0, "traceFile"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->i:Lb6/c;

    const-string v0, "buildIdMappingForArch"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$b;->j:Lb6/c;

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

    check-cast p1, Ls5/b0$a;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Ls5/a$b;->b(Ls5/b0$a;Lb6/e;)V

    return-void
.end method

.method public b(Ls5/b0$a;Lb6/e;)V
    .locals 3

    sget-object v0, Ls5/a$b;->b:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->d()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$b;->c:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$b;->d:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->g()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$b;->e:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$b;->f:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Ls5/a$b;->g:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Ls5/a$b;->h:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->i()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Ls5/a$b;->i:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$b;->j:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$a;->b()Ls5/c0;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
