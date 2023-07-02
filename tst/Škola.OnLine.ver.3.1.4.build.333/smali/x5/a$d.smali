.class final Lx5/a$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lx5/b0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lx5/a$d;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;

.field private static final e:Lg6/c;

.field private static final f:Lg6/c;

.field private static final g:Lg6/c;

.field private static final h:Lg6/c;

.field private static final i:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/a$d;

    invoke-direct {v0}, Lx5/a$d;-><init>()V

    sput-object v0, Lx5/a$d;->a:Lx5/a$d;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->b:Lg6/c;

    const-string v0, "gmpAppId"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->c:Lg6/c;

    const-string v0, "platform"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->d:Lg6/c;

    const-string v0, "installationUuid"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->e:Lg6/c;

    const-string v0, "buildVersion"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->f:Lg6/c;

    const-string v0, "displayVersion"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->g:Lg6/c;

    const-string v0, "session"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->h:Lg6/c;

    const-string v0, "ndkPayload"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$d;->i:Lg6/c;

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

    check-cast p1, Lx5/b0;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lx5/a$d;->b(Lx5/b0;Lg6/e;)V

    return-void
.end method

.method public b(Lx5/b0;Lg6/e;)V
    .locals 2

    sget-object v0, Lx5/a$d;->b:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$d;->c:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$d;->d:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->h()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lg6/e;->d(Lg6/c;I)Lg6/e;

    sget-object v0, Lx5/a$d;->e:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$d;->f:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$d;->g:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$d;->h:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->j()Lx5/b0$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$d;->i:Lg6/c;

    invoke-virtual {p1}, Lx5/b0;->g()Lx5/b0$d;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
