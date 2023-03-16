.class final Li7/l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf7/q;
.implements Lf7/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Li7/l;


# direct methods
.method private constructor <init>(Li7/l;)V
    .locals 0

    iput-object p1, p0, Li7/l$b;->a:Li7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Li7/l;Li7/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Li7/l$b;-><init>(Li7/l;)V

    return-void
.end method
