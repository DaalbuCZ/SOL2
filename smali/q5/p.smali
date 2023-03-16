.class public abstract Lq5/p;
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

.method public static a(Ls5/b0;Ljava/lang/String;Ljava/io/File;)Lq5/p;
    .locals 1

    new-instance v0, Lq5/b;

    invoke-direct {v0, p0, p1, p2}, Lq5/b;-><init>(Ls5/b0;Ljava/lang/String;Ljava/io/File;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls5/b0;
.end method

.method public abstract c()Ljava/io/File;
.end method

.method public abstract d()Ljava/lang/String;
.end method
