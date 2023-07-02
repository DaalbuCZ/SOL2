.class final Lx5/a$k;
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
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lx5/b0$e$d$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lx5/a$k;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;

.field private static final e:Lg6/c;

.field private static final f:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/a$k;

    invoke-direct {v0}, Lx5/a$k;-><init>()V

    sput-object v0, Lx5/a$k;->a:Lx5/a$k;

    const-string v0, "execution"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$k;->b:Lg6/c;

    const-string v0, "customAttributes"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$k;->c:Lg6/c;

    const-string v0, "internalKeys"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$k;->d:Lg6/c;

    const-string v0, "background"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$k;->e:Lg6/c;

    const-string v0, "uiOrientation"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$k;->f:Lg6/c;

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

    check-cast p1, Lx5/b0$e$d$a;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lx5/a$k;->b(Lx5/b0$e$d$a;Lg6/e;)V

    return-void
.end method

.method public b(Lx5/b0$e$d$a;Lg6/e;)V
    .locals 2

    sget-object v0, Lx5/a$k;->b:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$d$a;->d()Lx5/b0$e$d$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$k;->c:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$d$a;->c()Lx5/c0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$k;->d:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$d$a;->e()Lx5/c0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$k;->e:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$d$a;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$k;->f:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$d$a;->f()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lg6/e;->d(Lg6/c;I)Lg6/e;

    return-void
.end method
