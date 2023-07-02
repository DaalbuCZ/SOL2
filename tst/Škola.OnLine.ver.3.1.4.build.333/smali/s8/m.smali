.class public Ls8/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/m$b;,
        Ls8/m$a;
    }
.end annotation


# instance fields
.field public final a:Lt8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg8/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt8/a;

    sget-object v1, Lt8/f;->a:Lt8/f;

    const-string v2, "flutter/settings"

    invoke-direct {v0, p1, v2, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    iput-object v0, p0, Ls8/m;->a:Lt8/a;

    return-void
.end method


# virtual methods
.method public a()Ls8/m$a;
    .locals 2

    new-instance v0, Ls8/m$a;

    iget-object v1, p0, Ls8/m;->a:Lt8/a;

    invoke-direct {v0, v1}, Ls8/m$a;-><init>(Lt8/a;)V

    return-object v0
.end method
