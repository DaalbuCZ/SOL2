.class final Lk1/b$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lk1/o;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lk1/b$f;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/b$f;

    invoke-direct {v0}, Lk1/b$f;-><init>()V

    sput-object v0, Lk1/b$f;->a:Lk1/b$f;

    const-string v0, "networkType"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$f;->b:Lg6/c;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$f;->c:Lg6/c;

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

    check-cast p1, Lk1/o;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lk1/b$f;->b(Lk1/o;Lg6/e;)V

    return-void
.end method

.method public b(Lk1/o;Lg6/e;)V
    .locals 2

    sget-object v0, Lk1/b$f;->b:Lg6/c;

    invoke-virtual {p1}, Lk1/o;->c()Lk1/o$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$f;->c:Lg6/c;

    invoke-virtual {p1}, Lk1/o;->b()Lk1/o$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
