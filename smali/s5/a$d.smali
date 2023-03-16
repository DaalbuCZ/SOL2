.class final Ls5/a$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Ls5/b0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ls5/a$d;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;

.field private static final e:Lb6/c;

.field private static final f:Lb6/c;

.field private static final g:Lb6/c;

.field private static final h:Lb6/c;

.field private static final i:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls5/a$d;

    invoke-direct {v0}, Ls5/a$d;-><init>()V

    sput-object v0, Ls5/a$d;->a:Ls5/a$d;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->b:Lb6/c;

    const-string v0, "gmpAppId"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->c:Lb6/c;

    const-string v0, "platform"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->d:Lb6/c;

    const-string v0, "installationUuid"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->e:Lb6/c;

    const-string v0, "buildVersion"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->f:Lb6/c;

    const-string v0, "displayVersion"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->g:Lb6/c;

    const-string v0, "session"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->h:Lb6/c;

    const-string v0, "ndkPayload"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$d;->i:Lb6/c;

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

    check-cast p1, Ls5/b0;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Ls5/a$d;->b(Ls5/b0;Lb6/e;)V

    return-void
.end method

.method public b(Ls5/b0;Lb6/e;)V
    .locals 2

    sget-object v0, Ls5/a$d;->b:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$d;->c:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$d;->d:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->h()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$d;->e:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$d;->f:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$d;->g:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$d;->h:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->j()Ls5/b0$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$d;->i:Lb6/c;

    invoke-virtual {p1}, Ls5/b0;->g()Ls5/b0$d;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
