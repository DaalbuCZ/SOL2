.class final Ln7/l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk7/q;
.implements Lk7/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ln7/l;


# direct methods
.method private constructor <init>(Ln7/l;)V
    .locals 0

    iput-object p1, p0, Ln7/l$b;->a:Ln7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ln7/l;Ln7/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln7/l$b;-><init>(Ln7/l;)V

    return-void
.end method
