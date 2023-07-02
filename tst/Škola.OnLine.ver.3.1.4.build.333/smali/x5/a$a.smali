.class final Lx5/a$a;
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
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lx5/b0$a$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lx5/a$a;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/a$a;

    invoke-direct {v0}, Lx5/a$a;-><init>()V

    sput-object v0, Lx5/a$a;->a:Lx5/a$a;

    const-string v0, "arch"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$a;->b:Lg6/c;

    const-string v0, "libraryName"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$a;->c:Lg6/c;

    const-string v0, "buildId"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$a;->d:Lg6/c;

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

    check-cast p1, Lx5/b0$a$a;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lx5/a$a;->b(Lx5/b0$a$a;Lg6/e;)V

    return-void
.end method

.method public b(Lx5/b0$a$a;Lg6/e;)V
    .locals 2

    sget-object v0, Lx5/a$a;->b:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$a;->c:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$a$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$a;->d:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$a$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
