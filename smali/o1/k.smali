.class public abstract Lo1/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLg1/p;Lg1/i;)Lo1/k;
    .locals 1

    new-instance v0, Lo1/b;

    invoke-direct {v0, p0, p1, p2, p3}, Lo1/b;-><init>(JLg1/p;Lg1/i;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lg1/i;
.end method

.method public abstract c()J
.end method

.method public abstract d()Lg1/p;
.end method
