.class public abstract Lt9/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt9/c$a;
    }
.end annotation


# static fields
.field public static final n:Lt9/c$a;

.field private static final o:Lt9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt9/c$a;-><init>(Ls9/g;)V

    sput-object v0, Lt9/c;->n:Lt9/c$a;

    sget-object v0, Lm9/b;->a:Lm9/a;

    invoke-virtual {v0}, Lm9/a;->b()Lt9/c;

    move-result-object v0

    sput-object v0, Lt9/c;->o:Lt9/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lt9/c;
    .locals 1

    sget-object v0, Lt9/c;->o:Lt9/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
