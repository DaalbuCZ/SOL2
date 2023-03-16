.class final Lf1/b$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Lf1/o;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lf1/b$f;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/b$f;

    invoke-direct {v0}, Lf1/b$f;-><init>()V

    sput-object v0, Lf1/b$f;->a:Lf1/b$f;

    const-string v0, "networkType"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$f;->b:Lb6/c;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$f;->c:Lb6/c;

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

    check-cast p1, Lf1/o;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Lf1/b$f;->b(Lf1/o;Lb6/e;)V

    return-void
.end method

.method public b(Lf1/o;Lb6/e;)V
    .locals 2

    sget-object v0, Lf1/b$f;->b:Lb6/c;

    invoke-virtual {p1}, Lf1/o;->c()Lf1/o$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$f;->c:Lb6/c;

    invoke-virtual {p1}, Lf1/o;->b()Lf1/o$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
