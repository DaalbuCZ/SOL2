.class public final Lz9/k2;
.super Lj9/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/k2$a;
    }
.end annotation


# static fields
.field public static final p:Lz9/k2$a;


# instance fields
.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz9/k2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz9/k2$a;-><init>(Ls9/g;)V

    sput-object v0, Lz9/k2;->p:Lz9/k2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lz9/k2;->p:Lz9/k2$a;

    invoke-direct {p0, v0}, Lj9/a;-><init>(Lj9/g$c;)V

    return-void
.end method
