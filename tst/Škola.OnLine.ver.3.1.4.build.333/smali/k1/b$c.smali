.class final Lk1/b$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lk1/k;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lk1/b$c;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/b$c;

    invoke-direct {v0}, Lk1/b$c;-><init>()V

    sput-object v0, Lk1/b$c;->a:Lk1/b$c;

    const-string v0, "clientType"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$c;->b:Lg6/c;

    const-string v0, "androidClientInfo"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$c;->c:Lg6/c;

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

    check-cast p1, Lk1/k;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lk1/b$c;->b(Lk1/k;Lg6/e;)V

    return-void
.end method

.method public b(Lk1/k;Lg6/e;)V
    .locals 2

    sget-object v0, Lk1/b$c;->b:Lg6/c;

    invoke-virtual {p1}, Lk1/k;->c()Lk1/k$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$c;->c:Lg6/c;

    invoke-virtual {p1}, Lk1/k;->b()Lk1/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
