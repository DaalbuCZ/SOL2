.class final Lf1/b$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Lf1/m;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lf1/b$e;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;

.field private static final e:Lb6/c;

.field private static final f:Lb6/c;

.field private static final g:Lb6/c;

.field private static final h:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/b$e;

    invoke-direct {v0}, Lf1/b$e;-><init>()V

    sput-object v0, Lf1/b$e;->a:Lf1/b$e;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->b:Lb6/c;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->c:Lb6/c;

    const-string v0, "clientInfo"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->d:Lb6/c;

    const-string v0, "logSource"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->e:Lb6/c;

    const-string v0, "logSourceName"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->f:Lb6/c;

    const-string v0, "logEvent"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->g:Lb6/c;

    const-string v0, "qosTier"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$e;->h:Lb6/c;

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

    check-cast p1, Lf1/m;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Lf1/b$e;->b(Lf1/m;Lb6/e;)V

    return-void
.end method

.method public b(Lf1/m;Lb6/e;)V
    .locals 3

    sget-object v0, Lf1/b$e;->b:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Lf1/b$e;->c:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lb6/e;->b(Lb6/c;J)Lb6/e;

    sget-object v0, Lf1/b$e;->d:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->b()Lf1/k;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$e;->e:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$e;->f:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$e;->g:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$e;->h:Lb6/c;

    invoke-virtual {p1}, Lf1/m;->f()Lf1/p;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
