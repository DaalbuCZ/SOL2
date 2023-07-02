.class final Lk1/b$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lk1/l;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lk1/b$d;

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

    new-instance v0, Lk1/b$d;

    invoke-direct {v0}, Lk1/b$d;-><init>()V

    sput-object v0, Lk1/b$d;->a:Lk1/b$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->b:Lg6/c;

    const-string v0, "eventCode"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->c:Lg6/c;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->d:Lg6/c;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->e:Lg6/c;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->f:Lg6/c;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->g:Lg6/c;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$d;->h:Lg6/c;

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

    check-cast p1, Lk1/l;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lk1/b$d;->b(Lk1/l;Lg6/e;)V

    return-void
.end method

.method public b(Lk1/l;Lg6/e;)V
    .locals 3

    sget-object v0, Lk1/b$d;->b:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lg6/e;->e(Lg6/c;J)Lg6/e;

    sget-object v0, Lk1/b$d;->c:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$d;->d:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lg6/e;->e(Lg6/c;J)Lg6/e;

    sget-object v0, Lk1/b$d;->e:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$d;->f:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$d;->g:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lg6/e;->e(Lg6/c;J)Lg6/e;

    sget-object v0, Lk1/b$d;->h:Lg6/c;

    invoke-virtual {p1}, Lk1/l;->e()Lk1/o;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
