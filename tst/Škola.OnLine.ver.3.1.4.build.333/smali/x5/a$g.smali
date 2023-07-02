.class final Lx5/a$g;
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
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lx5/b0$e$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lx5/a$g;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;

.field private static final e:Lg6/c;

.field private static final f:Lg6/c;

.field private static final g:Lg6/c;

.field private static final h:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/a$g;

    invoke-direct {v0}, Lx5/a$g;-><init>()V

    sput-object v0, Lx5/a$g;->a:Lx5/a$g;

    const-string v0, "identifier"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->b:Lg6/c;

    const-string v0, "version"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->c:Lg6/c;

    const-string v0, "displayVersion"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->d:Lg6/c;

    const-string v0, "organization"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->e:Lg6/c;

    const-string v0, "installationUuid"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->f:Lg6/c;

    const-string v0, "developmentPlatform"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->g:Lg6/c;

    const-string v0, "developmentPlatformVersion"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$g;->h:Lg6/c;

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

    check-cast p1, Lx5/b0$e$a;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lx5/a$g;->b(Lx5/b0$e$a;Lg6/e;)V

    return-void
.end method

.method public b(Lx5/b0$e$a;Lg6/e;)V
    .locals 2

    sget-object v0, Lx5/a$g;->b:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$g;->c:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$g;->d:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$g;->e:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->g()Lx5/b0$e$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$g;->f:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$g;->g:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$g;->h:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
