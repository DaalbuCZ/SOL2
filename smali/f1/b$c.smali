.class final Lf1/b$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Lf1/k;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lf1/b$c;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/b$c;

    invoke-direct {v0}, Lf1/b$c;-><init>()V

    sput-object v0, Lf1/b$c;->a:Lf1/b$c;

    const-string v0, "clientType"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$c;->b:Lb6/c;

    const-string v0, "androidClientInfo"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$c;->c:Lb6/c;

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

    check-cast p1, Lf1/k;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Lf1/b$c;->b(Lf1/k;Lb6/e;)V

    return-void
.end method

.method public b(Lf1/k;Lb6/e;)V
    .locals 2

    sget-object v0, Lf1/b$c;->b:Lb6/c;

    invoke-virtual {p1}, Lf1/k;->c()Lf1/k$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$c;->c:Lb6/c;

    invoke-virtual {p1}, Lf1/k;->b()Lf1/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
