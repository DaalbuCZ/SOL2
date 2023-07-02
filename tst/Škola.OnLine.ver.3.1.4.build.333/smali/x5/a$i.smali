.class final Lx5/a$i;
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
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lx5/b0$e$c;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lx5/a$i;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;

.field private static final e:Lg6/c;

.field private static final f:Lg6/c;

.field private static final g:Lg6/c;

.field private static final h:Lg6/c;

.field private static final i:Lg6/c;

.field private static final j:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/a$i;

    invoke-direct {v0}, Lx5/a$i;-><init>()V

    sput-object v0, Lx5/a$i;->a:Lx5/a$i;

    const-string v0, "arch"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->b:Lg6/c;

    const-string v0, "model"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->c:Lg6/c;

    const-string v0, "cores"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->d:Lg6/c;

    const-string v0, "ram"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->e:Lg6/c;

    const-string v0, "diskSpace"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->f:Lg6/c;

    const-string v0, "simulator"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->g:Lg6/c;

    const-string v0, "state"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->h:Lg6/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->i:Lg6/c;

    const-string v0, "modelClass"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lx5/a$i;->j:Lg6/c;

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

    check-cast p1, Lx5/b0$e$c;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lx5/a$i;->b(Lx5/b0$e$c;Lg6/e;)V

    return-void
.end method

.method public b(Lx5/b0$e$c;Lg6/e;)V
    .locals 3

    sget-object v0, Lx5/a$i;->b:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lg6/e;->d(Lg6/c;I)Lg6/e;

    sget-object v0, Lx5/a$i;->c:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$i;->d:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lg6/e;->d(Lg6/c;I)Lg6/e;

    sget-object v0, Lx5/a$i;->e:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lg6/e;->e(Lg6/c;J)Lg6/e;

    sget-object v0, Lx5/a$i;->f:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lg6/e;->e(Lg6/c;J)Lg6/e;

    sget-object v0, Lx5/a$i;->g:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->j()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lg6/e;->f(Lg6/c;Z)Lg6/e;

    sget-object v0, Lx5/a$i;->h:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->i()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lg6/e;->d(Lg6/c;I)Lg6/e;

    sget-object v0, Lx5/a$i;->i:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lx5/a$i;->j:Lg6/c;

    invoke-virtual {p1}, Lx5/b0$e$c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
