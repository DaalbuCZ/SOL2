.class final Lg1/a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Lg1/m;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg1/a$e;

.field private static final b:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg1/a$e;

    invoke-direct {v0}, Lg1/a$e;-><init>()V

    sput-object v0, Lg1/a$e;->a:Lg1/a$e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lg1/a$e;->b:Lb6/c;

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

    check-cast p1, Lg1/m;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Lg1/a$e;->b(Lg1/m;Lb6/e;)V

    return-void
.end method

.method public b(Lg1/m;Lb6/e;)V
    .locals 1

    sget-object v0, Lg1/a$e;->b:Lb6/c;

    invoke-virtual {p1}, Lg1/m;->b()Lj1/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
