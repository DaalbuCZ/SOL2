.class final Ls5/a$r;
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
    name = "r"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Ls5/b0$e$d$c;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ls5/a$r;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;

.field private static final e:Lb6/c;

.field private static final f:Lb6/c;

.field private static final g:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls5/a$r;

    invoke-direct {v0}, Ls5/a$r;-><init>()V

    sput-object v0, Ls5/a$r;->a:Ls5/a$r;

    const-string v0, "batteryLevel"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$r;->b:Lb6/c;

    const-string v0, "batteryVelocity"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$r;->c:Lb6/c;

    const-string v0, "proximityOn"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$r;->d:Lb6/c;

    const-string v0, "orientation"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$r;->e:Lb6/c;

    const-string v0, "ramUsed"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$r;->f:Lb6/c;

    const-string v0, "diskUsed"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$r;->g:Lb6/c;

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

    check-cast p1, Ls5/b0$e$d$c;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Ls5/a$r;->b(Ls5/b0$e$d$c;Lb6/e;)V

    return-void
.end method

.method public b(Ls5/b0$e$d$c;Lb6/e;)V
    .locals 3

    sget-object v0, Ls5/a$r;->b:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$c;->b()Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$r;->c:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$r;->d:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$c;->g()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->a(Lb6/c;Z)Lb6/e;

    sget-object v0, Ls5/a$r;->e:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$c;->e()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$r;->f:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$c;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Ls5/a$r;->g:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    return-void
.end method
