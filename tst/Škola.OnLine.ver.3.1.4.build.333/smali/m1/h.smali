.class public abstract Lm1/h;
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

.method public static a(Landroid/content/Context;Lv1/a;Lv1/a;Ljava/lang/String;)Lm1/h;
    .locals 1

    new-instance v0, Lm1/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lm1/c;-><init>(Landroid/content/Context;Lv1/a;Lv1/a;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Lv1/a;
.end method

.method public abstract e()Lv1/a;
.end method
