.class public Lk8/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/m$b;,
        Lk8/m$a;
    }
.end annotation


# instance fields
.field public final a:Ll8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly7/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll8/a;

    sget-object v1, Ll8/f;->a:Ll8/f;

    const-string v2, "flutter/settings"

    invoke-direct {v0, p1, v2, v1}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    iput-object v0, p0, Lk8/m;->a:Ll8/a;

    return-void
.end method


# virtual methods
.method public a()Lk8/m$a;
    .locals 2

    new-instance v0, Lk8/m$a;

    iget-object v1, p0, Lk8/m;->a:Ll8/a;

    invoke-direct {v0, v1}, Lk8/m$a;-><init>(Ll8/a;)V

    return-object v0
.end method
