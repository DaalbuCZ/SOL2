.class public final Lf0/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Lf0/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf0/e;)Lf0/d;
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lf0/d;-><init>(Lf0/e;Ls9/g;)V

    return-object v0
.end method
