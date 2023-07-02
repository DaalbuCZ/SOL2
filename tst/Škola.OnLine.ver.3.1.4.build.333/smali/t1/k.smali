.class public abstract Lt1/k;
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

.method public static a(JLl1/p;Ll1/i;)Lt1/k;
    .locals 1

    new-instance v0, Lt1/b;

    invoke-direct {v0, p0, p1, p2, p3}, Lt1/b;-><init>(JLl1/p;Ll1/i;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ll1/i;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ll1/p;
.end method
