.class public final Lp6/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/b$a;
    }
.end annotation


# static fields
.field private static final b:Lp6/b;


# instance fields
.field private final a:Lp6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/b$a;

    invoke-direct {v0}, Lp6/b$a;-><init>()V

    invoke-virtual {v0}, Lp6/b$a;->a()Lp6/b;

    move-result-object v0

    sput-object v0, Lp6/b;->b:Lp6/b;

    return-void
.end method

.method constructor <init>(Lp6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/b;->a:Lp6/a;

    return-void
.end method

.method public static b()Lp6/b$a;
    .locals 1

    new-instance v0, Lp6/b$a;

    invoke-direct {v0}, Lp6/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lp6/a;
    .locals 1
    .annotation build Le6/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lp6/b;->a:Lp6/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/messaging/k0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
